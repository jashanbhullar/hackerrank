read n
avg=0
i=1
while [ $i -le $n ]
do
    read a
    avg=$(($avg+$a))
    i=$(($i+1))
done
printf "%.3f" $(echo "scale=4;$avg/$n" | bc)