class Book(object):
    paragraphs=[]
    images=[]
    tables=[]
    title=""
    def __init__(self, s):
        self.title=s
    def createNewParagraph(self, a):
        self.paragraphs.append(a)
    def createNewImage(self, a):
        self.images.append(a)
    def createNewTable(self, a):
        self.tables.append(a)
    def print(self):
        print(self.title)
        print(self.paragraphs)
        print(self.tables)
        print(self.images)

discoTitanic = Book("Disco Titanic")
discoTitanic.createNewParagraph("Paragraph 1")
discoTitanic.createNewParagraph("Paragraph 2")
discoTitanic.createNewParagraph("Paragraph 3")
discoTitanic.createNewImage("Image 1")
discoTitanic.createNewParagraph("Paragraph 4")
discoTitanic.createNewTable("Table 1")
discoTitanic.createNewParagraph("Paragraph 5")
discoTitanic.print()
