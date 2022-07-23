nterms= int(input('hoe many: '))
f=0
f2=1
count=0
while count <= nterms:
    result = f + f2
    print(result)
    f=f2
    f2=result
    count += 1
