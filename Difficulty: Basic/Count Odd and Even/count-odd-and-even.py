class Solution:
	def countOddEven(self, arr):
		#Code here
		count = [0, 0]
		
		for i in arr:
		    if i % 2 == 0:
		        count[1] += 1
		    else:
		        count[0] += 1
		
		return count