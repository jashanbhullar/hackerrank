def mutate_string(string, position, character):
	res = string[:position] + character 
	position += 1
	res += string[position:] 
	return res