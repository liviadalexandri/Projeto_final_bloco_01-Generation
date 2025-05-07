package projeto_final_bloco_01.controller;

import java.util.ArrayList;
import java.util.Optional;

import projeto_final_bloco_01.model.Produto;
import projeto_final_bloco_01.repository.ProdutoRepository;

public class ProdutoController implements ProdutoRepository {

    private ArrayList<Produto> listaProdutos = new ArrayList<>();
    private int id = 0;

    public Produto procurarPorId(int id) {
        Optional<Produto> produto = buscarNaCollection(id);
        if (produto.isPresent()) {
            return produto.get();
        } else {
            throw new RuntimeException(String.format("O Produto com ID %d não foi encontrado.", id));
        }
    }

    @Override
    public void listarTodos() {
        for (Produto produto : listaProdutos) {
            produto.visualizar();
        }
    }

    @Override
    public void cadastrar(Produto produto) {
        listaProdutos.add(produto);
        System.out.println("O produto foi criado com sucesso!");
    }

    @Override
    public void atualizar(Produto produto) {
        Optional<Produto> buscaProduto = buscarNaCollection(produto.getId());

        if (buscaProduto.isPresent()) {
            listaProdutos.set(listaProdutos.indexOf(buscaProduto.get()), produto);
            System.out.printf("\nO produto com ID %d foi atualizado com sucesso!\n", produto.getId());
        } else {
            System.out.printf("\nO produto com ID %d não foi encontrado.\n", produto.getId());
        }
    }

    @Override
    public void deletar(int id) {
        Optional<Produto> produto = buscarNaCollection(id);

        if (produto.isPresent()) {
            listaProdutos.remove(produto.get());
            System.out.printf("\nO produto com ID %d foi excluído com sucesso.\n", id);
        } else {
            System.out.printf("\nO produto com ID %d não foi encontrado.\n", id);
        }
    }

    public int gerarId() {
        return ++id;
    }

    private Optional<Produto> buscarNaCollection(int id) {
        for (Produto produto : listaProdutos) {
            if (produto.getId() == id) {
                return Optional.of(produto);
            }
        }
        return Optional.empty();
    }

	@Override
	public void procurarPorNumero(int id) {
		// TODO Auto-generated method stub
		
	}
}