<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="html" indent="yes"/>
    
    <xsl:template match="/">
        <html>
            <head>
                <title>Book Information</title>
                <link rel="stylesheet" type="text/css" href="styles.css"/>
            </head>
            <body>
                <table>
                    <thead>
                        <tr>
                            <th>Title</th>
                            <th>Author</th>
                            <th>ISBN</th>
                            <th>Publisher</th>
                            <th>Edition</th>
                            <th>Price</th>
                        </tr>
                    </thead>
                    <tbody>
                        <xsl:for-each select="books/book">
                            <tr>
                                <td><xsl:value-of select="title"/></td>
                                <td class="author"><xsl:value-of select="author"/></td>
                                <td><xsl:value-of select="isbn"/></td>
                                <td><xsl:value-of select="publisher"/></td>
                                <td><xsl:value-of select="edition"/></td>
                                <td><xsl:value-of select="price"/></td>
                            </tr>
                        </xsl:for-each>
                    </tbody>
                </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>
