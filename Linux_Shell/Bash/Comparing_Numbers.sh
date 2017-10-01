read a
read b
if [ $a -eq $b ]
then
    echo "X is equal to Y"
elif [ $a -le $b ]
then
    echo "X is less than Y"
else
    echo "X is greater than Y"
fi