class Solution:
    def intersect(self, nums1, nums2):
        nums1 = sorted(nums1);
        nums2 = sorted(nums2);

        result = []

        while nums1 and nums2:
            if nums[0] == nums2[0]:
                result.append(nums1.pop(0))
                nums2.pop(0)
            elif nums1[0] > nums2[0]:
                nums2.pop(0)
            else:
                nums1.pop(0)

        print(result)

if __name__ == "__main__":
    intersect([1,2,2,1], [2,2])