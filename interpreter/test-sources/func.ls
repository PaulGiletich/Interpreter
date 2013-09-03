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

def func(x)
    return x^2
end

for i in range(1, 1000)
    p = point.new(i, func(i))
    puts(p.str())
end
