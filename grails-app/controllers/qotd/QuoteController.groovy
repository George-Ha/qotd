package qotd

class QuoteController {
	
	static scaffold = true //http://localhost:8080/qotd/quote/index
	static defaultAction = "home"
	def quoteService
	
	def ajaxRandom() {
		def randomQuote = quoteService.getRandomQuote()
		render {
			q(randomQuote.content)
			p(randomQuote.author)
		}
	}
	
	def home() {
		def quote = quoteService.getRandomQuote()
		[ quote : quote]
	}
	
	def random() {
		def randomQuote = quoteService.getRandomQuote()
		[ quote : randomQuote ]
	}
}
