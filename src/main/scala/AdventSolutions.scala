class AdventSolutions {
  def DayOnePartOne(a: String): Int =
  {
    a.count(_ == '(') - a.count(_ == ')')
  }

  def DayOnePartTwo(a: String): Int =
  {
    var level = 0
    var done = false
    var i = 0
    while(i < a.length() && !done)
    {
        if(a(i) == ')')
        {
          level -= 1
        }else if(a(i) == '(')
        {
          level += 1
        }

        if(level < 0)
          done = true
        else
          i += 1
      }

    return i + 1
  }
}
