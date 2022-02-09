from xml.dom import minidom
import xml.etree.ElementTree as ET

def parseDom():
	mydom = minidom.parse("sample.xml")
	items = mydom.getElementsByTagName("item")
	for item in items:
		print item.attributes["name"].value
		print item.firstChild.data
		print item.childNodes[0].data

def parseEtree():
	myEtree = ET.parse("sample.xml")
	root = myEtree.getroot()
	print root[0][1].attrib

	for element in root:
		for subelement in element:
			print subelement.attrib

if __name__ == "__main__":
	# parseDom()
	parseEtree()