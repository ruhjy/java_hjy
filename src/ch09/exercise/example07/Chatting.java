package ch09.exercise.example07;

public class Chatting {
	class Chat {
		void start() {
		}

		void sendMessage(String message) {
		}
	}

	void startChat(String chatId) {
		String nickName = null;
		nickName = chatId;
		// String nickName = chatId; // 해결방법

		Chat chat = new Chat() {

			@Override
			void start() {
				while (true) {
					String inputData = "안녕하세요";
					String message = "[" + nickName + "] " + inputData;
					sendMessage(message);
				}
			}
		};

		chat.start();
	}
}
