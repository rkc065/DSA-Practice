class Solution:
    def shortestCompletingWord(self, licensePlate: str, words: List[str]) -> str:
         d = Counter(x for x in licensePlate.lower() if x.isalpha())
         return min([w for w in words if not d - Counter(w)], key = len)