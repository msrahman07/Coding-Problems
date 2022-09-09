"""
NeetCode: 8/150

Design an algorithm to encode a list of strings to a string. The encoded string is then sent over the network and is decoded back to the original list of strings.

Machine 1 (sender) has the function:

string encode(vector strs) {
  // ... your code
  return encoded_string;
}
Machine 2 (receiver) has the function:
vector decode(string s) {
  //... your code
  return strs;
}
So Machine 1 does:

string encoded_string = encode(strs);
and Machine 2 does:

vector strs2 = decode(encoded_string);
strs2 in Machine 2 should be the same as strs in Machine 1.

Implement the encode and decode methods.

Note:
The string may contain any possible characters out of 256 valid ascii characters. Your algorithm should be generalized enough to work on any possible characters.
Do not use class member/global/static variables to store states. Your encode and decode algorithms should be stateless.
Do not rely on any library method such as eval or serialize methods. You should implement your own encode/decode algorithm.
"""

class Solution:
	def decode(strs):
	    hash_str_to_skip = int(strs.split("#")[0]) + len(strs.split("#")[0])
	    starting_point = hash_str_to_skip
	    
	    #since hashString starts and ends with #, skipping both
	    hash_string = strs[len(strs.split("#")[0])+1 : hash_str_to_skip-1]
	    length_of_words = hash_string.split("#") # converting length of words into words list
	    
	    decoded_list = []
	    for l in length_of_words:
		decoded_list.append(strs[starting_point : starting_point+int(l)])
		starting_point += int(l)
	    
	    return decoded_list

	def encode(strs):
	    lengths = []
	    full_string = ""
	    
	    for s in strs:
		lengths.append(len(s))
		full_string += s
		
	    hash_string = "#"
	    
	    for i in lengths:
		hash_string += (str(i) +"#")
	    
	    # take length os hashString and add it as prefix
	    hash_string = str(len(hash_string)) + hash_string
	    return hash_string+full_string
    
#===============================================================================
test1 = ["I", "Love", "Me"]
test2 = ["blah", "tlas", "123@3123hasd", "boomToom*&^"]
test3 = ["blah", "tlas", "123@3123hasd", "boomToom*&^", "blah", "tlas", "123@3123hasd"]
test4 = ["blah", "tlas", "123@3123hasd", "boomToom*&^123@3123hasd","blah", "tlas", "123@3123hasd", "boomToom*&^", "blah", "tlas", "123@3123hasd"]
test5 = ["blah", "tlas", "", "boomToom*&^123@3123hasd","blah", "tlas", "", "boomToom*&^", "blah", "tlas", ""]
test6 = [""]

print("Test 1: ", test1 == decode(encode(test1))) #True
print("Test 2: ", test2 == decode(encode(test2))) #True
print("Test 3: ", test3 == decode(encode(test3))) #True
print("Test 4: ", test4 == decode(encode(test4))) #True
print("Test 5: ", test4 == decode(encode(test5))) #False
print("Test 6: ", test5 == decode(encode(test6))) #False
