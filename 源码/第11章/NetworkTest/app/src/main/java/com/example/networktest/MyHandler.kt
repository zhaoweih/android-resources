package com.example.networktest

import org.xml.sax.Attributes
import org.xml.sax.helpers.DefaultHandler

class MyHandler : DefaultHandler() {

    override fun startDocument() {
    }

    override fun startElement(uri: String, localName: String, qName: String, attributes: Attributes) {
    }

    override fun characters(ch: CharArray, start: Int, length: Int) {
    }

    override fun endElement(uri: String, localName: String, qName: String) {
    }

    override fun endDocument() {
    }

}