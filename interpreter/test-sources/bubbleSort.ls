def bubbleSort(list)
    for i in range(0, size(list)-1)
        iMin = i
        for j in range(i, size(list)-1)
            if list[j] < list[iMin]
                iMin = j
            end
        end
        list[i], list[iMin] = swap(list[i], list[iMin])
    end
end

a=[1,4,2,5,3,45,42,3,2,65,23,65,89,6,454,689,4,4,2,76,4,676,9,6,5,76,34,4,2,76,23]
bubbleSort(a)
puts(a)
