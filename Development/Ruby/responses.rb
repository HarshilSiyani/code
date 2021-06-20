def response(user_response)

if user_response == 'I will take the Ring to Mordor'
    "you have my bow and my axe"
elsif user_response == " You're a lizard, harry"
    "I'm a what?"
elsif user_response == "gotta em"
    "Pokemon"
elsif user_response.include? ("?")
    "i'm the captain now!"
elsif user_response == "G'DAY MATE"
    ''
else
    "Say that again"
end
end
p response('I will take the Ring to Mordor')
