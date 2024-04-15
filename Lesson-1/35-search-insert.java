int searchInsert(int nums[], int length, int target) {
    int low = 0;
    int high = length - 1;
    int middle;

    while (low <= high) {
        middle = low + (high - low) / 2;
        
        if (nums[middle] == target)
            return middle;
        else if (nums[middle] < target)
            low = middle + 1;
        else
            high = middle - 1;
    }
    return low;
}
