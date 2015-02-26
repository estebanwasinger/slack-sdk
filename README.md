[![Circle CI](https://circleci.com/gh/estebanwasinger/slack-sdk.svg?style=svg)](https://circleci.com/gh/estebanwasinger/slack-sdk)

# Slack Java SDK

## Slack API compatibility

### api
Method | Description | Is Avaible?
------------ | ------------- | -----
**api.test** | Checks API calling code | NO

### auth
Method | Description | Is Avaible?
------------ | ------------- | -----
**auth.test** | Checks authentication & identity. | **YES**

### channels
Get info on your team's Slack channels, create or archive channels, invite users, set the topic and purpose, and mark a channel as read.

Method | Description | Is Avaible?
------------ | ------------- | -----
**channels.archive** | Archives a channel | NO
**channels.create** | Creates a channel. | **YES**
**channels.history** | Fetches history of messages and events from a channel. | **YES**
**channels.info** | Gets information about a channel. | **YES**
**channels.invite** | Invites a user to a channel. | NO
**channels.join** | Joins a channel, creating it if needed. | **YES**
**channels.kick** | Removes a user from a channel. | NO
**channels.leave** | Leaves a channel. | **YES**
**channels.list** | Lists all channels in a Slack team. | **YES**
**channels.mark** | Sets the read cursor in a channel. | NO
**channels.rename** | Renames a channel. | **YES**
**channels.setPurpose** | Sets the purpose for a channel. | NO
**channels.setTopic** | Sets the topic for a channel. | NO
**channels.unarchive** | Unarchives a channel. | NO

### chat
Post chat messages to Slack.

Method | Description | Is Avaible?
------------ | ------------- | -----
**chat.delete** | Deletes a message. | **YES**
**chat.postMessage** | Sends a message to a channel. | **YES**
**chat.update** | Updates a message. | **YES**

### emoji

Method | Description | Is Avaible?
------------ | ------------- | -----
**emoji.list** | Lists custom emoji for a team. | NO

### files
Get info on files uploaded to Slack, upload new files to Slack.

Method | Description | Is Avaible?
------------ | ------------- | -----
**files.delete** | Deletes a file. | NO
**files.info** | Gets information about a team file. | NO
**files.list** | Lists & filters team files. | NO
**files.upload** | Uploads or creates a file. | NO


// Work in progress
