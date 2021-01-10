class Solution {
public:
    string baseNeg2(int N) {
        string res = "";
        while (N) {
            res = to_string(N & 1) + res;
            N = -(N >> 1);
        }
        return res == "" ? "0" : res;
    }
};

// Please follow more detailed explanation in my channel on youtube.

// Intuition
// Maybe write a base2 function first?
// How about add minus -?
// Done.

// Explanation
// base2 function is quite basis of basis.

// check last digit by N%2 or N&1.
// If it's 1, you get 1.
// If it's 0, you get 0.

// shift to right N >> 1.
// This actually do two things:
// 2.1 Minus 1 if last digit is 1.
// 2.2 Divide N by 2.

// base -2 is no difference,
// except that we need divide N by -2.

// So we do the same thing,
// just add a sign - after division.

// The explanation seems not enough.
// But if you really understand how we do the base2,
// you will find just literally the same process.


// More about N = -(N >> 1)
// Explained by @yren2:
// It's mostly implementation defined. and most compilers choose to preserve the sign by setting the most significant bits after the shift.
// for example, -3 in 8-bit is 11111101 and -3>>1 is 11111110, which is -2. (round towards -inf)

// this is different from -3/2, which is -1. (round towards 0)
// same goes -3>>2 == -1 and -3/4 == 0.


// Complexity
// Time O(logN)
// Space O(logN)

// Note that I didn't deal with string concatenation,
// and just take this part as O(1).

// Instead of create a new string each time,
// we can improve this process using some operations join/reverse or data structure list/vector .
// Like Java we may need StringBuilder,
// but those are not what I want to discuss deeply here.