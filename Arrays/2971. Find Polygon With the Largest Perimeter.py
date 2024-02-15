class Solution(object):
    def largestPerimeter(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        nums.sort()
        sum_value = 0
        perimeter = -1

        for num in nums:
            # check if the coming edge length is less
            # than the sum of the other sides
            # add that to the perimeter
            if num < sum_value:
                perimeter = num + sum_value
            sum_value += num

        return perimeter
        
