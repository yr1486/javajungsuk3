package ch06;
// TvŬ������ �־��� ������� �ϼ��Ͻÿ�.
// �ϼ��� �Ŀ� �����ؼ� �־��� ���� ����� ��ġ�ϴ��� Ȯ���϶�.
class MyTv {
	boolean isPowerOn; // false
	int channel;
	int volume;
	
	final int MAX_VOLUME  = 100;
	final int MIN_VOLUME  = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	// isPowerOn�� ���� true�� false��, false�� true�� �ٲ۴�.
	void turnOnOff() {
		isPowerOn = !isPowerOn;
	}
	
	void volumeUp() {
		// ������ ���� max_volume���� ���� ���� ���� 1���� ��Ų��.
		if(volume<MAX_VOLUME) {
			++volume;
		}
	}

	void volumeDown() {
		// ������ ���� min_volume���� Ŭ���� ���� 1���� ��Ų��.
		if(volume>MIN_VOLUME) {
			--volume;
		}
	}
	void channelUp() {
		// channel�� ���� 1���� ��Ų��.
		// ���� channel�� max_channel�̸� , channel�� ���� MIN_channal�� �ٲ۴�.
		++channel;
		if(channel > MAX_CHANNEL) {
			channel = MIN_CHANNEL;
		}
	}
	
	void channelDown() {
		// channel�� ���� 1���� ��Ų��.
		// ���� channel�� MIN_CHANNEL�̸�, channel�� ���� MAX_CHANNEL�� �ٲ۴�.
		--channel;
		if(channel < MIN_CHANNEL) {
			channel = MAX_CHANNEL;
		}
	}
}

class MyTvTest {
	public static void main(String[] args) {
		MyTv t = new MyTv();
		t.channel = 100;
		t.volume = 0;

		System.out.println("CH:"+t.channel+", VOL:"+t.volume);
		
		t.channelDown();
		t.volumeDown();
		System.out.println("CH:"+t.channel+", VOL:"+t.volume); //
		
		t.volume=100;
		t.channelUp();
		t.volumeUp();
		System.out.println("CH:"+t.channel+", VOL:"+t.volume);
	}
	
}