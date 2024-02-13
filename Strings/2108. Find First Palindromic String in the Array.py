class Solution:
    def firstPalindrome(self, words):
        for s in words:
            if self.checkPalindrome(s):
                return s
        return ""

    def checkPalindrome(self, s):
        left = 0
        right = len(s) - 1

        while left <= right:
            if s[left] == s[right]:
                left += 1
                right -= 1
            else:
                return False
        return True
