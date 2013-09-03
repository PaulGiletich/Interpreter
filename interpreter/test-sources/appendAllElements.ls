def appendAllElements(list)
    for item in list
        if item is list
            appendAllElements(item)
        end
        else
            item = item+1
        end
    end
    return list
end

puts(appendAllElements([1,2,3,4,5]))
