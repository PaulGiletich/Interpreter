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
