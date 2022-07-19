# LINE-MAN-Wongnai-Mysterious-Code

Solve the challenge and Save your spot for a fast track interview with LINE MAN Wongnai Engineering Team.

เชิญชวนชาว Tech มาร่วมแก้ LINE MAN Wongnai Mysterious Code ตอบถูก ตอบไว ลุ้นได้เข้าร่วม Fast Track Interview กับ LINE MAN Wongnai Engineering Team และ ลุ้นรับ LINE MAN Food Coupon 500 บาท จำนวน 20 รางวัล

# LINE-MAN-Wongnai-Mysterious-Code Answer

1. From the secret code `aWFuZ25vVzpOQU06RU5JTDp0YTpzdTpuaW9K` 
you will need to decode by the base64 decoding method

input: `aWFuZ25vVzpOQU06RU5JTDp0YTpzdTpuaW9K`

after decoding: `iangnoW:NAM:ENIL:ta:su:nioJ`

2. after we saw the output, we noticed that it is an English string with a colon separate
word, and if we look carefully, it is reversed, so let's reverse it

input: `iangnoW:NAM:ENIL:ta:su:nioJ`

after reversing: `Join:us:at:LINE:MAN:Wongnai`

3. now it is readable but to get the real message, we need to get rid of the colon,
so we need to remove the colon

input: `Join:us:at:LINE:MAN:Wongnai`

after removing colon: `Join us at LINE MAN Wongnai`

Answer: `Join us at LINE MAN Wongnai`

# ![image](https://user-images.githubusercontent.com/108649272/178962304-75130546-d912-41fe-95e2-44a1623f7c83.png)

# Coding Quiz

**var whatIsIt string**

**secret := "aWFuZ25vVzpOQU06RU5JTDp0YTpzdTpuaW9K"**

**sd, _ := base64.StdEncoding.DecodeString(secret)**
