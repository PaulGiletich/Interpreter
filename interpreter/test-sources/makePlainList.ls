def makePlainList(arr)
    retval = []
    for item in arr
        if item is list
            retval += makePlainList(item)
        end
        else
            retval << item
        end
    end
    return retval
end

a=[1,2,[3,4,[5,6,7],42]]
plainA = makePlainList(a)
puts(plainA)