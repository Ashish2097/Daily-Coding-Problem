def cons(a, b):
    def pair(f):
        return f(a, b)
    return pair

def car(g):
    def left(a,b):
        return a
    return g(left)

print(car(cons(1,2)))

def cdr(g):
    def right(a,b):
        return b
    return g(right)

print(cdr(cons(1,2)))

#car(cons(1,2))=> car(pair)=> pair(left) => left(1,2)=> 1