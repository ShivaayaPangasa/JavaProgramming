package Module1.Q35_BitwiseOperations;

public class BitwiseCalculator{

    public void demonstrate(int a, int b){

        System.out.println("a & b = " + (a & b));
        System.out.println("a | b = " + (a | b));
        System.out.println("a ^ b = " + (a^b));
        System.out.println("~a = " + (~a));
        System.out.println("a << 1 = " + (a<<1));
        System.out.println("a >> 1 = " + (a >>1));

    }

}

/* Bitwise operators in Java are symbols used to perform operations directly on the binary representations (bits) of integer values. 

They work bit-by-bit on primitive integral types (int, long, short, byte, char). Attempting to use them on floating-point numbers (float, double) 
or booleans (in a bitwise context where types mismatch improperly) triggers a compilation error.

Instead of manipulating the overall value of a variable, these operators alter its raw 0 and 1 components, making them exceptionally 
fast and memory-efficient.

Java supports seven bitwise and bit-shift operators.

Operator            Name                           Description                             Example (using int)

&                Bitwise AND              Returns 1 if both bits are 1.                        5 & 3 → 1
|                Bitwise OR               Returns 1 if at least one bit is 1.                  5 | 3 → 7
^                Bitwise XOR              Returns 1 if bits are different.                     5 ^ 3 → 6
~                Bitwise NOT              Inverts all bits (0 becomes 1 and vice versa).       ~5 → -6
<<               Left Shift               Shifts bits left; fills with 0 on the right.         5 << 1 → 104
>>               Signed Right Shift       Shifts bits right; preserves the sign bit.          -8 >> 1 → -4
>>>              Unsigned Right Shift     Shifts bits right; fills with 0 on the left.        -8 >>> 1 → 2147483644


consider two variables: 
int a = 5; (binary: 0101) and int b = 3; (binary: 0011).

1. Bitwise AND (&)
Compares each bit. It yields 1 only if both matching bits are 1. (& - 1 if both values are 1)
  0101  (5)
& 0011  (3)
------
  0001  (Result: 1)

2. Bitwise OR (|)
Yields 1 if either of the bits (or both) is 1. (| - 1 if any one value is 1)
  0101  (5)
| 0011  (3)
------
  0111  (Result: 7)

3. Bitwise XOR (^)
Yields 1 if the bits are opposite (one is 0, the other is 1). (^ - 1 if values are opposite)
  0101  (5)
^ 0011  (3)
------
  0110  (Result: 6)

4. Bitwise NOT (~)
A unary operator that flips every bit. (0 becomes 1 ; 1 becomes 0)
Java uses Two's Complement representation for negative numbers, meaning ~a equals -(a + 1).

~ 00000101  (5)
----------
  11111010  (Result: -6)

In Java, standard integer numbers (int) always occupy 32 bits of memory. The MSB is the very first one on the far left, known as the Sign Bit:
0 in the sign bit means the number is positive.
1 in the sign bit means the number is negative.

Bit Shift Operators - Shift operators move the entire bit pattern of a number to the left or right.
  
5. Left Shift (<<): 
Shifting bits left by n spaces effectively multiplies the integer value by 2^n. Vacated positions are filled with zeros.
  
6. Signed Right Shift (>>):
Shifting bits right by n spaces divides the number by 2^n (ignoring the remainder). It copies the highest bit (the sign bit) to 
maintain whether the number is positive or negative.

7. Unsigned Right Shift (>>>): 
Moves all bits right but always injects 0 into the leftmost positions, ignoring the sign bit. 
This is unique to Java and helps process raw bit streams like pixel colors or encryption data.

*/