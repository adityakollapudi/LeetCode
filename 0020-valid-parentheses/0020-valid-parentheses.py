class Solution(object):
    def isValid(self, s):
        dic = {'[': ']', '{': '}', '(': ')'}
        stack = []

        for char in s:
            if char in dic:  # opening bracket
                stack.append(char)
            else:  # closing bracket
                if not stack or dic[stack[-1]] != char:
                    return False
                stack.pop()

        return len(stack) == 0


s = Solution()
print(s.isValid("([])"))     # True
print(s.isValid("(]"))       # False
print(s.isValid("()[]{}"))   # True
print(s.isValid("()"))       # True
print(s.isValid("([)]"))     # False
