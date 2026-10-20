package Module5.Annotations.Q26_JsonField;

import java.lang.annotation.*;
import java.lang.reflect.Field;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface JsonField { String name(); }

class Person {
    @JsonField(name = "full_name") private String fullName = "Shivaaya Pangasa";
    private int age = 19;
    private boolean active = true;
    private String nickname = null;
}

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        System.out.println(toSimpleJson(new Person()));
    }

    // A small teaching example only; production JSON should use a tested JSON library.
    static String toSimpleJson(Object object) throws IllegalAccessException {
        StringBuilder json = new StringBuilder("{");
        Field[] fields = object.getClass().getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            Field field = fields[i];
            field.setAccessible(true);
            JsonField mapping = field.getAnnotation(JsonField.class);
            String key = mapping == null ? field.getName() : mapping.name();
            Object value = field.get(object);
            if (i > 0) json.append(", ");
            json.append('"').append(escape(key)).append("\": ").append(jsonValue(value));
        }
        return json.append('}').toString();
    }

    static String jsonValue(Object value) {
        if (value == null) return "null";
        if (value instanceof Number || value instanceof Boolean) return value.toString();
        return "\"" + escape(value.toString()) + "\"";
    }

    static String escape(String value) {
        return value.replace("\\", "\\\\").replace("\"", "\\\"")
                    .replace("\n", "\\n").replace("\r", "\\r").replace("\t", "\\t");
    }
}
