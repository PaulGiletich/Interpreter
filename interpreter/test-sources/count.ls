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
