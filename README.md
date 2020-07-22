# Knuth-Morris-Pratt-algorithm-in-Java-Non-overlapping-occurrences
Write a program that finds all non-overlapping occurrences of a pattern in a text.

Input: two strings, a pattern pp and a text tt.

Output: the first line should contain the number of non-overlapping occurrences of the pattern in the text. The second line should contain the index of these occurrences separated by space.

For two overlapping substrings, consider as occurrence the one that has the least starting index. (it is supposed that a searching starts from the beginning of the text).

 Report a typo
Sample Input 1:

aba
ababababa
Sample Output 1:

2
0 4
Sample Input 2:

a
a
Sample Output 2:

1
0
Sample Input 3:

a
bbb
Sample Output 3:

0
