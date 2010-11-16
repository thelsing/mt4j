package advanced.extension3D;

import org.mt4j.MTApplication;
import org.mt4j.sceneManagement.Iscene;

import advanced.extension3D.Extension3DScene;

public class Start3DExtensionExample extends MTApplication{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Iscene scene;

	public static void main(String args[]){		
		initialize();
	}
	
	@Override
	public void startUp(){
		scene = new Extension3DScene(this, "3D Model scene");
		this.addScene(scene);
	}

	@Override
	public void draw() {
		super.draw();        
	}
	
}
