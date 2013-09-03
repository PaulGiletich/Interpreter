class point
    def new(x,y)
        this.x = x
        this.y = y
    end

    def distanceTo(other)
        return ((this.x - other.x)^2 + (this.y - other.y)^2)^(1/2)
    end
end

p = point.new(5,3)
p2 = point.new(10,5)
puts(p.distanceTo(p2))
