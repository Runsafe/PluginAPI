package no.runsafe.api.command;

import no.runsafe.api.command.argument.IArgumentList;

public interface IAsyncCallbackExecute<T>
{
	/**
	 * If you have optional arguments, you still need to override this method, but you can leave it empty.
	 *
	 *
	 * @param executor   The player or console executing the command
	 * @param parameters The arguments you defined in the constructor and their values as supplied by the user
	 * @return Data object that gets passed to SyncPostExecute
	 */
	T OnAsyncExecute(ICommandExecutor executor, IArgumentList parameters);

	/**
	 * This method gets called on the main thread after the {@link IAsyncCallbackExecute#OnAsyncExecute(ICommandExecutor, IArgumentList)} completes
	 *
	 * @param result The value returned from the background thread
	 */
	void SyncPostExecute(T result);
}
