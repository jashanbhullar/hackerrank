ar=($(cat))
pt=(${ar[@]/*[aA]*/})
echo ${pt[@]}