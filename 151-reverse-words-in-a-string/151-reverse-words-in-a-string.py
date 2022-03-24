class Solution:
    def reverseWords(self, s: str) -> str:
        List=s.split()
        return ' '.join(List[::-1])
        
        