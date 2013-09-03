def greet(name)
    return "Hello, " + name
end

puts(greet("Paul"))

puts()
puts("boolean operator check")
x = true
y = false
puts(x and y)
puts(x or y)
puts(!x)
puts([1,2,3] is list)

puts("Checking operators")
puts(10+2)
puts(10-2)
puts(10*2)
puts(10/2)
puts(10^2)
puts(12 > 11)
puts(12 < 11)

puts()
if true
    puts("if statement check")
end

d=3
until d<0
    puts("until statement check " + d)
    d=d-1
end

c=0
while c<3
    c=c+1
    puts("while statement check " + c)
end

b=[1,2,3]
puts("arrays sum check ")
puts(b+b)

a=[1,2]
puts(size(a))
puts(range(1,5))

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

a=[1,4,2,5,3,45,45,3,2,65,23,65,89,6,454,689,4,4,2,76,4,676,9,6,5,76,34,4,2,76,23]
bubbleSort(a)
puts(a)

a.param1 = "Testing object param"
puts(a.param1)

puts("classes check")

class point
    def new(x,y)
        this.x = x
        this.y = y
    end

    def distanceTo(other)
        return ((this.x - other.x)^2 + (this.y - other.y)^2)^(1/2)
    end

    def _plus_(other)
        if other is point
            ret = point.new(this.x + other.x, this.y + other.y)
            return ret
        end
    end

	def str()
		return "(" + this.x + ";" + this.y + ")"
	end
end

p1 = point.new(5,3)
p2 = point.new(10,5)
puts("distance from " + p1.str() + " to " + p2.str() + " is " + p1.distanceTo(p2))
p3 = p1 + p2
puts(p1.str() + " + " + p2.str() + " = " + p3.str())

