package qotd

// Test data:
// new qotd.Quote(author : 'Larry Walll', content : 'There is more than one method to our madness.').save()
// new qotd.Quote(author : 'Chuck Norris Facts', content : 'Chuck Norris always uses his own design patterns, and his favorite is the Roundhouse Kick.').save()
// new qotd.Quote(author : 'Eric Raymond',	content : 'Being a social outcast helps you stay concentrated on the really imoprtant things, like thinking and hacking.').save()
class Quote {

	String content
	String author
	Date created = new Date()
	
    static constraints = {
		author (blank : false)
		content(maxSize:1000, blank : false)
    }
}
