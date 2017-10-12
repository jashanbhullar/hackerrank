read n
ar=($(cat))
ans=${ar[0]}
for(( i=1; i < ${#ar[@]};i++ )); 
do
    $((ans ^= ${ar[i]} ))
done
echo $ans