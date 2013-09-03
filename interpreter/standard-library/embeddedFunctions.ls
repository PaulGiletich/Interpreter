def range(a,b)
    ret = []
    x=a
    until x > b
        ret << x
        x += 1
    end
    return ret
end

def size(list)
    size=0
    for i in list
        size += 1
    end
    return size
end

def swap(a,b)
    ret = [b,a]
    return ret
end
