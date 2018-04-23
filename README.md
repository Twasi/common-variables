# common-variables

## Random
Generates a random number in a given range.

### Parameters
- 0: min - a number representing the lower limit
- 1: max - a number representing the upper limit

### Examples
`$random(1,100)` - Number between 1 and 100

`$random(0,1)` - 0 or 1

### Alias
- rdm

## Channel
Returns the current channel the bot is in.

### Parameters
None

### Examples
`$channel` - Current channel the bot is in

### Alias
- streamer

## Sender
Returns the twitchname of the sender that triggered the message. If the message was not triggered by a sender, it will return ERROR_NO_SENDER.

### Parameters
None

### Examples
`$sender` - The sender that triggered the message

### Alias
None
