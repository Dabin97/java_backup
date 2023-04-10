package anonyumous;

public class Police {
	private Gun gun;

	public Police(Gun gun) {
		super();
		this.gun = gun;
	}

	public Gun getGun() {
		return gun;
	}

	public void setGun(Gun gun) {
		this.gun = gun;
	}
	
	public void shot() {
		gun.shot();
	}
	public void reload() {
		gun.reload();
	}
}
