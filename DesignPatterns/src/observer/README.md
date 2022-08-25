Problem:
	 Imagine two types of objects a Customer and a Store. The customer is interested in a brand which should become available soon.
	 The customer could visit the store every day and check the availability (while the product is still en route, most of these trips would be pointless).
	 Alternatively, the store could send tons of emails (which might be considered spam) to all customers each time a new product arrives.

Solution:
	 The Observer pattern suggests that you add a subscription mechanism to a publisher class (Subject) so individual objects (subscribers)
	 can subscribe to or unsubscribe from a stream of events coming from that publisher.

