def minimize_cost(arr, n, m):
    def is_feasible(arr, n, m, mid):
        groups = 1
        current_min = arr[0]
        current_max = arr[0]

        for i in range(1, n):
            if arr[i] - current_min > mid:
                groups += 1
                current_min = arr[i]
                current_max = arr[i]
            else:
                current_max = arr[i]

        return groups <= m

    arr.sort()
    left = 0
    right = arr[n - 1] - arr[0]
    result = -1

    while left <= right:
        mid = left + (right - left) // 2
        if is_feasible(arr, n, m, mid):
            result = mid
            right = mid - 1
        else:
            left = mid + 1

    return result

# Custom input
arr = [6, 93, 32, 88, 9, 58, 15, 3]
n = len(arr)
m = 3
result = minimize_cost(arr, n, m)
print("Minimum possible cost:", result)
