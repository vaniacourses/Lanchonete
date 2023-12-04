package Helpers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

class TestEncryptadorMD5 {

	@Test
    public void testEncryptar() {
        EncryptadorMD5 encryptadorMD5 = new EncryptadorMD5();

        String senha = "password";
        String Hashexperado = "5f4dcc3b5aa765d61d8327deb882cf99";

        String Hashobtido = encryptadorMD5.encryptar(senha);

        assertEquals(Hashexperado, Hashobtido);
    }
	
	@Test
    public void testEncryptadorMD5MutanteConditionalOperatorReplacement1() {
EncryptadorMD5MutanteConditionalOperatorReplacement1 encryptadorMD5MutanteConditionalOperatorReplacement1 =
		new EncryptadorMD5MutanteConditionalOperatorReplacement1();

        String senha = "password";
        String Hashexperado = "5f4dcc3b5aa765d61d8327deb882cf99";

        String Hashobtido = encryptadorMD5MutanteConditionalOperatorReplacement1.encryptar(senha);

        assertEquals(Hashexperado, Hashobtido);
    }
	
	@Test
    public void testEncryptadorMD5MutanteConditionalOperatorReplacement2() {
EncryptadorMD5MutanteConditionalOperatorReplacement2 encryptadorMD5MutanteConditionalOperatorReplacement1 =
		new EncryptadorMD5MutanteConditionalOperatorReplacement2();

        String senha = "password";
        String Hashexperado = "5f4dcc3b5aa765d61d8327deb882cf99";

        String Hashobtido = encryptadorMD5MutanteConditionalOperatorReplacement1.encryptar(senha);

        assertEquals(Hashexperado, Hashobtido);
    }
}
