Simple dynamic language interpreter written in Java


## Usage:

> java -jar lang.jar <path to source file>

## Examples:

### 1 - Point class with some methods

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
  
output:

  distance from (5;3) to (10;5) is 5.385164807134504
  (5;3) + (10;5) = (15;8)
  
### 2 - Bubble sort function

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

output:

  [1, 2, 2, 2, 2, 3, 3, 4, 4, 4, 4, 4, 5, 5, 6, 6, 9, 23, 23, 34, 42, 45, 65, 65, 76, 76, 76, 89, 454, 676, 689]


### 3 - Count occurences in list

  def count(element, list)
    count = 0
    for(e in list)
      if(e == element)
        count += 1
      end
    end
    return count
  end
  
  list = [ 1, 2, 4, 7, 1, 2, 4, 7, 1, 2, 4, 7 ]
  puts(count(7, list))
  
output:

  3

