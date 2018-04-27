require 'rest-client'

begin
  response = RestClient.get('https://tls12.pagar.me', headers={})
  puts response
rescue Exception => e
  puts 'Got error!'
  puts e
  raise e
end
