package br.unifor.MeuCliente;

public abstract class Manager{

		private FramePrincipal frame;

		public Manager (FramePrincipal frame) {
			this.frame = frame;
		}

		/**
		 * @return o frame responsavel.
		 */
		public FramePrincipal getFrame() {
			return frame;
		}
}
