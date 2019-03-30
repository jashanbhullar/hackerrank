def product(fracs):
    t = reduce(lambda x,y:Fraction(x.numerator*y.numerator,x.denominator*y.denominator ),fracs)
    return t.numerator, t.denominator