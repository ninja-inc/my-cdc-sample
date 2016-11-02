package contracts

org.springframework.cloud.contract.spec.Contract.make {
			request {
				method 'POST'
				url '/reservations/R12345'
				body("""
					{
						"guestName":"ninja-inc",
						"amount":1200
					}
				"""
				)
				headers {
					header('Content-Type', 'application/json')
				}
			}
			response {
				status 200
				body "R12345"
				headers {
					header('Content-Type', 'text/plain;charset=ISO-8859-1')
				}
			}
}
