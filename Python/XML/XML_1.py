import sys
import xml.etree.ElementTree as etree

def get_attr_number(node):
	ans = 0
	ans += len(node.attrib)
	for i in node:
		ans += len(i.attrib)
		if len(i) > 0:
			ans += get_attr_number(i)
	return ans

sys.stdin.readline()
xml = sys.stdin.read()
tree = etree.ElementTree(etree.fromstring(xml))
root = tree.getroot()
print(get_attr_number(root))